# aws-elb-test

This is a dummy repo just meant to demonstrate a bug.

## Running

First, make sure moto is running on localhost:5000. Then:

```bash
% gradle run
```

## Error Message

```
WARNING: Unable to parse date '2020-04-18 07:25:26.469378':  Invalid format: "2020-04-18 07:25:26.469378" is malformed at " 07:25:26.469378"
java.lang.IllegalArgumentException: Invalid format: "2020-04-18 07:25:26.469378" is malformed at " 07:25:26.469378"
        at org.joda.time.format.DateTimeParserBucket.doParseMillis(DateTimeParserBucket.java:187)
        at org.joda.time.format.DateTimeFormatter.parseMillis(DateTimeFormatter.java:780)
        at com.amazonaws.util.DateUtils.doParseISO8601Date(DateUtils.java:98)
        at com.amazonaws.util.DateUtils.parseISO8601Date(DateUtils.java:77)
        at com.amazonaws.transform.SimpleTypeStaxUnmarshallers$DateStaxUnmarshallerFactory.unmarshall(SimpleTypeStaxUnmarshallers.java:199)
        at com.amazonaws.services.elasticloadbalancing.model.transform.LoadBalancerDescriptionStaxUnmarshaller.unmarshall(LoadBalancerDescriptionStaxUnmarshaller.java:149)
        at com.amazonaws.services.elasticloadbalancing.model.transform.DescribeLoadBalancersResultStaxUnmarshaller.unmarshall(DescribeLoadBalancersResultStaxUnmarshaller.java:54)
        at com.amazonaws.services.elasticloadbalancing.model.transform.DescribeLoadBalancersResultStaxUnmarshaller.unmarshall(DescribeLoadBalancersResultStaxUnmarshaller.java:30)
        at com.amazonaws.http.StaxResponseHandler.handle(StaxResponseHandler.java:106)
        at com.amazonaws.http.StaxResponseHandler.handle(StaxResponseHandler.java:42)
        at com.amazonaws.http.response.AwsResponseHandlerAdapter.handle(AwsResponseHandlerAdapter.java:69)
        at com.amazonaws.http.AmazonHttpClient$RequestExecutor.handleResponse(AmazonHttpClient.java:1714)
        at com.amazonaws.http.AmazonHttpClient$RequestExecutor.handleSuccessResponse(AmazonHttpClient.java:1434)
        at com.amazonaws.http.AmazonHttpClient$RequestExecutor.executeOneRequest(AmazonHttpClient.java:1356)
        at com.amazonaws.http.AmazonHttpClient$RequestExecutor.executeHelper(AmazonHttpClient.java:1139)
        at com.amazonaws.http.AmazonHttpClient$RequestExecutor.doExecute(AmazonHttpClient.java:796)
        at com.amazonaws.http.AmazonHttpClient$RequestExecutor.executeWithTimer(AmazonHttpClient.java:764)
        at com.amazonaws.http.AmazonHttpClient$RequestExecutor.execute(AmazonHttpClient.java:738)
        at com.amazonaws.http.AmazonHttpClient$RequestExecutor.access$500(AmazonHttpClient.java:698)
        at com.amazonaws.http.AmazonHttpClient$RequestExecutionBuilderImpl.execute(AmazonHttpClient.java:680)
        at com.amazonaws.http.AmazonHttpClient.execute(AmazonHttpClient.java:544)
        at com.amazonaws.http.AmazonHttpClient.execute(AmazonHttpClient.java:524)
        at com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancingClient.doInvoke(AmazonElasticLoadBalancingClient.java:2425)
        at com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancingClient.invoke(AmazonElasticLoadBalancingClient.java:2392)
        at com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancingClient.invoke(AmazonElasticLoadBalancingClient.java:2381)
        at com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancingClient.executeDescribeLoadBalancers(AmazonElasticLoadBalancingClient.java:1610)
        at com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancingClient.describeLoadBalancers(AmazonElasticLoadBalancingClient.java:1581)
        at com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancingClient.describeLoadBalancers(AmazonElasticLoadBalancingClient.java:1622)
        at com.github.rwhogg.App.main(App.java:18)
```
