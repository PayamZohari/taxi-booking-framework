# Start Monitor your project!

Hi! in this section we want to talk about **metrics**. first of all metric is a nessecary part in every project. it helps you monitor your project and figure out weaknesses and problems in your code. for example you can check a service performance using this feature and lots of other cool stuffs
now we start by defining what is prometheus and what is grafana generally.


## Prometheus

prometheus is a tool that you can add to your project and send updates in specified intervals to revise project metrics.

## Alerting
another essential thing in every software team is alerting.
at first i must say, our project alerting is not complete reaally much. but it works on slack.
additionally, you must define some rules for prometheus and if one of that rules didn't meet your needs, prometheus alert manager send a notification for you.
for example if in 15minutes your database did not answered well or in 30minutes you didn't have a successful payment it can alert you about it.
finally, you can set alert manager using a Telegram bot, Slack, or even Bale bot(an iraninan messanger)

## Grafana

think about grafana in this way. we gathered information about our project status using prometheus. now we need another tool to see them visually. although prometheus generate some details for us. however, we need a better tool and that is where grafana comes and uses prometheus to help us see metrics visually and generate queries on data

## Docker

in here, we are not going to talk about docker much. basically, docker generates a virtual environement for us which is the same between all computer systems and we can have our code, prometheus, grafana,etc together.
you can find about it more in link below:
[more-on-docker](https://www.docker.com/)

## Commands

you can start docker by command below. keep in mind you must be in the directory which docker-compose.yml exists

    docker compose up -d
then you can stop it using:

    docker compose down
check containers status using:

    docker ps -a
 check logs live using:

    docker logs <container-name> -f
keep in mind, grafana is accessible using port 3011 in your localsystem. alertmanager is on 9093 and prometheus is on 9090 and its metrics are in port 2112. your own app is also accessible through 8080.

you can find more commands about docker in link below:
[docker-commands](https://docs.docker.com/reference/cli/docker/)    


## Make Metrics

for creating your own metric, at first you must create a class in the service you want to work in. for example check **ExtendedMetricImpl** class in user/service
then you can add your own metric like code below:

    ExtendedMetricImpl  metric  =  new  ExtendedMetricImpl(4040);
	metric.Success("messaging", "chapar", "UserContacts", 100);
in the example above we are creating a success metric with four labels: messaging,chapar,UserContacts,100
and we are using 4040 port for example.

## Metrics in details
we have used for prometheus metric types: Count, Gauge, Histogram, Summary
all of these four methods are compatible with them.

we defined metrics which are listed in here:
|name|description|
|--|--|
|Failure  |is responsible for submitting failures and add count and histogram metrics for a failed event. FOR COUNT AND HISTOGRAM AND SUMMARY|
|Success  | is responsible for submitting successful events and add count and histogram metrics for a successful event. FOR COUNT AND HISTOGRAM AND SUMMARY |
|Total  |is responsible for adding count metrics for a total event. ONLY FOR COUNT | 

for checking details about every method please visit link below:
[metrics-types](https://prometheus.io/docs/concepts/metric_types/)

> **Note:** we add four general metrics which are usable and vital in every project. for adding more metrics you can override us.
