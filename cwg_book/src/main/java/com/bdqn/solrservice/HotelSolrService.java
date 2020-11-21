package com.bdqn.solrservice;

import cn.itrip.entity.ItripHotelVO;
import cn.itrip.entity.Page;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.impl.XMLResponseParser;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;

import java.io.IOException;
import java.util.List;

public class HotelSolrService {
    static String url = "http://localhost:8080/solr-4.9.1/hotel";
    private HttpSolrClient httpSolrClient;
    public HotelSolrService() {
        //获取solr客户端对象并且加载对应的core的url
        httpSolrClient=new HttpSolrClient(url);
        //设置响应解析器
        httpSolrClient.setParser(new XMLResponseParser());
        //建立连接的最长时间
        httpSolrClient.setConnectionTimeout(20000);
    }
    //根据城市ID获取酒店信息
    public List<ItripHotelVO> getHotelList(SolrQuery query) throws IOException, SolrServerException {
        List<ItripHotelVO> hotelList =httpSolrClient.query(query).getBeans(ItripHotelVO.class);
        return hotelList;
    }
    //按条件进行酒店分页检索
    public Page<ItripHotelVO> getHotelListForPage(SolrQuery query,int curpage, Integer pagesize) throws IOException, SolrServerException {
//        QueryResponse response = httpSolrClient.query(query);
//        List<ItripHotelVO> hotelList =response.getBeans(ItripHotelVO.class);
//        SolrDocumentList solrDocuments=((QueryResponse) response).getResults();
//        //int total = new Long(solrDocuments.getNumFound()).intValue();
//        Page page = new Page(curpage, pagesize);
//        page.setRows(hotelList);
//        return page;
        QueryResponse queryResponse = null;
        queryResponse = httpSolrClient.query(query);


        List<ItripHotelVO> list = queryResponse.getBeans(ItripHotelVO.class);
        SolrDocumentList solrDocuments=((QueryResponse) queryResponse).getResults();
        Page page=new Page(curpage,pagesize,new Long(solrDocuments.getNumFound()).intValue());
        page.setRows(list);
        return page;
    }

}
