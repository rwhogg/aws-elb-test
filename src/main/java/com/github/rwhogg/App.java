package com.github.rwhogg;

import com.amazonaws.services.elasticloadbalancing.*;
import com.amazonaws.services.elasticloadbalancing.model.*;
import java.util.*;

public class App 
{
    public static void main(String[] args)
    {
        final AmazonElasticLoadBalancingClient elbClient = new AmazonElasticLoadBalancingClient();
        elbClient.setEndpoint("http://127.0.0.1:5000");
        final Listener listener = new Listener("HTTP", 3000, 4000);
        final CreateLoadBalancerRequest request = new CreateLoadBalancerRequest("MyLoadBalancer")
            .withListeners(Arrays.asList(listener));
        final CreateLoadBalancerResult result = elbClient.createLoadBalancer(request);

        final DescribeLoadBalancersResult describeResult = elbClient.describeLoadBalancers();
        System.out.println(describeResult.toString());
    }
}
