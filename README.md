# kubernetes-spring-boot-app-deployment

Example SpringBoot app tutorial to deploy to Kubernetes cluster using kind.

1. clone Repo 
2. cd into the directory
3. build SpringBoot maven app using following command 

         ./mvnw clean package
3. run the app locally to test if its working 

         ./mvnw SpringBoot:run
4. create a Docker image of the app locally using the `Dockerfile`

         docker build -t swagger-java-app:latest .
5. check if image was created 
         
         docker images     
7. run the image locally and test if it works 
         
         docker run --rm -it --entrypoint bash <image-name>
8. tag the image    
         
         docker build -t swagger-java-app:latest .
9. push the image to your private artifactory
         
         docker push <YOUR_HOST>.jfrog.io/default-docker-local/swagger-java-app:latest
10. run the kind cluster locally
         
         kind create cluster
11. create a namespace
         
         kubectl apply -f resources/namespace.yaml
12. create a secret of artifactory 
         
         kubectl create secret docker-registry regcred --docker-server=<YOUR_HOST>.jfrog.io --docker-username=<USER_NAME> --docker-password=<IDENTITY_TOKEN> --docker-email=<EMAIL_ADDRESS>
13. create deplument
         
         kubectl apply -f resources/deployment.yaml
14. check staus 
         
         kubectl get deployments 
         kubectl get pods
