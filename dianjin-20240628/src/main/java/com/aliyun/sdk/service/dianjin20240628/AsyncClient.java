// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dianjin20240628.models.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    CompletableFuture<CreateFinReportSummaryTaskResponse> createFinReportSummaryTask(CreateFinReportSummaryTaskRequest request);

    CompletableFuture<CreateLibraryResponse> createLibrary(CreateLibraryRequest request);

    CompletableFuture<CreatePredefinedDocumentResponse> createPredefinedDocument(CreatePredefinedDocumentRequest request);

    CompletableFuture<DeleteDocumentResponse> deleteDocument(DeleteDocumentRequest request);

    CompletableFuture<DeleteLibraryResponse> deleteLibrary(DeleteLibraryRequest request);

    CompletableFuture<EvictTaskResponse> evictTask(EvictTaskRequest request);

    CompletableFuture<GetAppConfigResponse> getAppConfig(GetAppConfigRequest request);

    CompletableFuture<GetDocumentChunkListResponse> getDocumentChunkList(GetDocumentChunkListRequest request);

    CompletableFuture<GetDocumentListResponse> getDocumentList(GetDocumentListRequest request);

    CompletableFuture<GetDocumentUrlResponse> getDocumentUrl(GetDocumentUrlRequest request);

    CompletableFuture<GetFilterDocumentListResponse> getFilterDocumentList(GetFilterDocumentListRequest request);

    CompletableFuture<GetHistoryListByBizTypeResponse> getHistoryListByBizType(GetHistoryListByBizTypeRequest request);

    CompletableFuture<GetLibraryResponse> getLibrary(GetLibraryRequest request);

    CompletableFuture<GetLibraryListResponse> getLibraryList(GetLibraryListRequest request);

    CompletableFuture<GetParseResultResponse> getParseResult(GetParseResultRequest request);

    CompletableFuture<GetSummaryTaskResultResponse> getSummaryTaskResult(GetSummaryTaskResultRequest request);

    CompletableFuture<GetTaskStatusResponse> getTaskStatus(GetTaskStatusRequest request);

    CompletableFuture<InvokePluginResponse> invokePlugin(InvokePluginRequest request);

    CompletableFuture<PreviewDocumentResponse> previewDocument(PreviewDocumentRequest request);

    CompletableFuture<ReIndexResponse> reIndex(ReIndexRequest request);

    CompletableFuture<RecallDocumentResponse> recallDocument(RecallDocumentRequest request);

    CompletableFuture<RecognizeIntentionResponse> recognizeIntention(RecognizeIntentionRequest request);

    CompletableFuture<RunChatResultGenerationResponse> runChatResultGeneration(RunChatResultGenerationRequest request);

    ResponseIterable<RunChatResultGenerationResponseBody> runChatResultGenerationWithResponseIterable(RunChatResultGenerationRequest request);

    CompletableFuture<RunLibraryChatGenerationResponse> runLibraryChatGeneration(RunLibraryChatGenerationRequest request);

    ResponseIterable<RunLibraryChatGenerationResponseBody> runLibraryChatGenerationWithResponseIterable(RunLibraryChatGenerationRequest request);

    CompletableFuture<UpdateDocumentResponse> updateDocument(UpdateDocumentRequest request);

    CompletableFuture<UpdateLibraryResponse> updateLibrary(UpdateLibraryRequest request);

}
