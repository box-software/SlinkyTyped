package typingsSlinky.awsDashSdk

import typingsSlinky.awsDashSdk.clientsS3Mod.PresignedPost
import typingsSlinky.awsDashSdk.clientsS3Mod.PutObjectRequest
import typingsSlinky.awsDashSdk.libS3ManagedUnderscoreUploadMod.ManagedUpload
import typingsSlinky.awsDashSdk.libS3ManagedUnderscoreUploadMod.ManagedUpload.ManagedUploadOptions
import typingsSlinky.awsDashSdk.libS3ManagedUnderscoreUploadMod.ManagedUpload.SendData
import typingsSlinky.awsDashSdk.libS3PresignedUnderscorePostMod.PresignedPost.Params
import typingsSlinky.awsDashSdk.libServiceMod.Service
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/services/s3", JSImport.Namespace)
@js.native
object libServicesS3Mod extends js.Object {
  @js.native
  class S3Customizations () extends Service {
    /**
      * Get the form fields and target URL for direct POST uploading.
      */
    def createPresignedPost(params: Params): PresignedPost = js.native
    /**
      * Get the form fields and target URL for direct POST uploading.
      */
    def createPresignedPost(params: Params, callback: js.Function2[/* err */ js.Error, /* data */ PresignedPost, Unit]): Unit = js.native
    /**
      * Get a pre-signed URL for a given operation name.
      */
    def getSignedUrl(operation: String, params: js.Any): String = js.native
    /**
      * Get a pre-signed URL for a given operation name.
      */
    def getSignedUrl(
      operation: String,
      params: js.Any,
      callback: js.Function2[/* err */ js.Error, /* url */ String, Unit]
    ): Unit = js.native
    /**
      * Returns a 'thenable' promise that will be resolved with a pre-signed URL for a given operation name.
      */
    def getSignedUrlPromise(operation: String, params: js.Any): js.Promise[String] = js.native
    /**
      * Uploads an arbitrarily sized buffer, blob, or stream, using intelligent
      * concurrent handling of parts if the payload is large enough. You can
      * configure the concurrent queue size by setting `options`. Note that this
      * is the only operation for which the SDK can retry requests with stream
      * bodies.
      */
    def upload(params: PutObjectRequest): ManagedUpload = js.native
    def upload(params: PutObjectRequest, callback: js.Function2[/* err */ Error, /* data */ SendData, Unit]): ManagedUpload = js.native
    def upload(params: PutObjectRequest, options: ManagedUploadOptions): ManagedUpload = js.native
    def upload(
      params: PutObjectRequest,
      options: ManagedUploadOptions,
      callback: js.Function2[/* err */ js.Error, /* data */ SendData, Unit]
    ): ManagedUpload = js.native
  }
  
  /* static members */
  @js.native
  object S3Customizations extends js.Object {
    var ManagedUpload: TypeofClassManagedUpload = js.native
  }
  
}

