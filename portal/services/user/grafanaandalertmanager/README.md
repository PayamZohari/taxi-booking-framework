# Grafana and Alert manager (Docker-based solution)

Here in this repository, we have designed a report generation and hive automation process.


## Things to do;

*  Clone the Github repository 
*  Build the grafana and alertmanager images
*  set project up with running ./setup_project.sh



## Start and run the grafana and alertmanager container
```bash
dockercompose up
```
When all the services all started successfully, now go to http://localhost:3001/ to check that Grafana has started successfully, and http://localhost:9095/ that alertmanager is up and running. 


