@javax.xml.bind.annotation.XmlSchema(namespace = "http://api.svc.retailer.regie.icss.com/beans")
/**
 * 零售户API规范
 * models 
 * 对应到数据库表及表关系映射
 * 
 * services
 * 为当前微服务对外提供的接口
 * 所有事务处理从这个层开始
 * Service 不能相互调用，必须通过Facade其做门户方式
 * 
 * 
 * beans gateways
 * 对外部暴露的接口描述
 * 
 * 
 */
package com.icss.regie.retailer.svc.api;
