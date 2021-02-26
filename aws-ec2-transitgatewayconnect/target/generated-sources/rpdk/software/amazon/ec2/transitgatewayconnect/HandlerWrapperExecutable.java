// This is a generated file. Modifications will be overwritten.
package software.amazon.ec2.transitgatewayconnect;

import com.amazonaws.AmazonServiceException;
import software.amazon.awssdk.awscore.exception.AwsServiceException;
import software.amazon.awssdk.regions.PartitionMetadata;
import software.amazon.awssdk.regions.Region;
import software.amazon.cloudformation.Action;
import software.amazon.cloudformation.exceptions.BaseHandlerException;
import software.amazon.cloudformation.ExecutableWrapper;
import software.amazon.cloudformation.loggers.LambdaLogPublisher;
import software.amazon.cloudformation.metrics.MetricsPublisher;
import software.amazon.cloudformation.proxy.AmazonWebServicesClientProxy;
import software.amazon.cloudformation.proxy.CallbackAdapter;
import software.amazon.cloudformation.proxy.HandlerErrorCode;
import software.amazon.cloudformation.proxy.HandlerRequest;
import software.amazon.cloudformation.proxy.LoggerProxy;
import software.amazon.cloudformation.proxy.ProgressEvent;
import software.amazon.cloudformation.proxy.RequestContext;
import software.amazon.cloudformation.proxy.RequestData;
import software.amazon.cloudformation.proxy.ResourceHandlerRequest;
import software.amazon.cloudformation.proxy.ResourceHandlerTestPayload;
import software.amazon.cloudformation.resource.SchemaValidator;
import software.amazon.cloudformation.resource.Serializer;
import software.amazon.cloudformation.scheduler.CloudWatchScheduler;
import com.amazonaws.services.lambda.runtime.Context;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;


public class HandlerWrapperExecutable extends ExecutableWrapper<ResourceModel, CallbackContext> {

    private final Configuration configuration = new Configuration();
    private JSONObject resourceSchema;
    private final Map<Action, BaseHandler<CallbackContext>> handlers = new HashMap<>();
    private final static TypeReference<HandlerRequest<ResourceModel, CallbackContext>> REQUEST_REFERENCE =
        new TypeReference<HandlerRequest<ResourceModel, CallbackContext>>() {};
    private final static TypeReference<ResourceModel> TYPE_REFERENCE =
        new TypeReference<ResourceModel>() {};
    private final static TypeReference<ResourceHandlerTestPayload<ResourceModel, CallbackContext>> TEST_ENTRY_TYPE_REFERENCE =
        new TypeReference<ResourceHandlerTestPayload<ResourceModel, CallbackContext>>() {};


    public HandlerWrapperExecutable() {
        initialiseHandlers();
    }

    private void initialiseHandlers() {
        handlers.put(Action.CREATE, new CreateHandler());
        handlers.put(Action.READ, new ReadHandler());
        handlers.put(Action.UPDATE, new UpdateHandler());
        handlers.put(Action.DELETE, new DeleteHandler());
        handlers.put(Action.LIST, new ListHandler());
    }

    @Override
    public ProgressEvent<ResourceModel, CallbackContext> invokeHandler(
            final AmazonWebServicesClientProxy proxy,
            final ResourceHandlerRequest<ResourceModel> request,
            final Action action,
            final CallbackContext callbackContext) {
        final String actionName = (action == null) ? "<null>" : action.toString(); // paranoia
        if (!handlers.containsKey(action))
            throw new RuntimeException("Unknown action " + actionName);

        final BaseHandler<CallbackContext> handler = handlers.get(action);

        loggerProxy.log(String.format("[%s] invoking handler...", actionName));
        final ProgressEvent<ResourceModel, CallbackContext> result = handler.handleRequest(proxy, request, callbackContext, loggerProxy);
        loggerProxy.log(String.format("[%s] handler invoked", actionName));
        return result;
    }

    public static void main(String[] args) throws IOException {
        if (args.length != 1){
            System.exit(1);
        }
        final String outputFile = (UUID.randomUUID().toString() + ".txt");
        try(FileOutputStream output = new FileOutputStream(outputFile)){
            try(InputStream input=IOUtils.toInputStream(args[0],"UTF-8")){
                new HandlerWrapperExecutable().handleRequest(input, output);
                output.flush();
            }
        }
        System.out.println("__CFN_RESOURCE_START_RESPONSE__");
        readFileToSystemOut(outputFile);
        System.out.println("__CFN_RESOURCE_END_RESPONSE__");
    }

private static void readFileToSystemOut(final String fileName) throws IOException {
        //Create object of FileReader
        final FileReader inputFile = new FileReader(fileName);
        try(BufferedReader bufferReader = new BufferedReader(inputFile)) {
            String line;
            while ((line = bufferReader.readLine()) != null)   {
                System.out.println(line);
            }
        }
    }
    @Override
    public JSONObject provideResourceSchemaJSONObject() {
        if (resourceSchema == null) {
            resourceSchema = this.configuration.resourceSchemaJSONObject();
        }
        return resourceSchema;
    }

    @Override
    public Map<String, String> provideResourceDefinedTags(final ResourceModel resourceModel) {
        return this.configuration.resourceDefinedTags(resourceModel);
    }

    @Override
    protected ResourceHandlerRequest<ResourceModel> transform(final HandlerRequest<ResourceModel, CallbackContext> request) throws IOException {
        final RequestData<ResourceModel> requestData = request.getRequestData();

        return ResourceHandlerRequest.<ResourceModel>builder()
            .clientRequestToken(request.getBearerToken())
            .desiredResourceState(requestData.getResourceProperties())
            .previousResourceState(requestData.getPreviousResourceProperties())
            .desiredResourceTags(getDesiredResourceTags(request))
            .systemTags(request.getRequestData().getSystemTags())
            .awsAccountId(request.getAwsAccountId())
            .logicalResourceIdentifier(request.getRequestData().getLogicalResourceId())
            .nextToken(request.getNextToken())
            .region(request.getRegion())
            .awsPartition(PartitionMetadata.of(Region.of(request.getRegion())).id())
            .build();
    }

    @Override
    protected TypeReference<HandlerRequest<ResourceModel, CallbackContext>> getTypeReference() {
        return REQUEST_REFERENCE;
    }

    @Override
    protected TypeReference<ResourceModel> getModelTypeReference() {
        return TYPE_REFERENCE;
    }
}