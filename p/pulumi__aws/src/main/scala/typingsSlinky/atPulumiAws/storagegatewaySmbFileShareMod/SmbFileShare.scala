package typingsSlinky.atPulumiAws.storagegatewaySmbFileShareMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.outputMod.Output
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/storagegateway/smbFileShare", "SmbFileShare")
@js.native
class SmbFileShare protected () extends CustomResource {
  /**
    * Create a SmbFileShare resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SmbFileShareArgs) = this()
  def this(name: String, args: SmbFileShareArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of the SMB File Share.
    */
  val arn: Output[String] = js.native
  /**
    * The authentication method that users use to access the file share. Defaults to `ActiveDirectory`. Valid values: `ActiveDirectory`, `GuestAccess`.
    */
  val authentication: Output[js.UndefOr[String]] = js.native
  /**
    * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Defaults to `S3_STANDARD`. Valid values: `S3_STANDARD`, `S3_STANDARD_IA`, `S3_ONEZONE_IA`.
    */
  val defaultStorageClass: Output[js.UndefOr[String]] = js.native
  /**
    * ID of the SMB File Share.
    */
  val fileshareId: Output[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the file gateway.
    */
  val gatewayArn: Output[String] = js.native
  /**
    * Boolean value that enables guessing of the MIME type for uploaded objects based on file extensions. Defaults to `true`.
    */
  val guessMimeTypeEnabled: Output[js.UndefOr[Boolean]] = js.native
  /**
    * A list of users in the Active Directory that are not allowed to access the file share. Only valid if `authentication` is set to `ActiveDirectory`.
    */
  val invalidUserLists: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Boolean value if `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Defaults to `false`.
    */
  val kmsEncrypted: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Amazon Resource Name (ARN) for KMS key used for Amazon S3 server side encryption. This value can only be set when `kmsEncrypted` is true.
    */
  val kmsKeyArn: Output[js.UndefOr[String]] = js.native
  /**
    * The ARN of the backed storage used for storing file data.
    */
  val locationArn: Output[String] = js.native
  /**
    * Access Control List permission for S3 bucket objects. Defaults to `private`.
    */
  val objectAcl: Output[js.UndefOr[String]] = js.native
  /**
    * Boolean to indicate write status of file share. File share does not accept writes if `true`. Defaults to `false`.
    */
  val readOnly: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Boolean who pays the cost of the request and the data download from the Amazon S3 bucket. Set this value to `true` if you want the requester to pay instead of the bucket owner. Defaults to `false`.
    */
  val requesterPays: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the underlying storage.
    */
  val roleArn: Output[String] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * A list of users in the Active Directory that are allowed to access the file share. Only valid if `authentication` is set to `ActiveDirectory`.
    */
  val validUserLists: Output[js.UndefOr[js.Array[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/storagegateway/smbFileShare", "SmbFileShare")
@js.native
object SmbFileShare extends js.Object {
  /**
    * Get an existing SmbFileShare resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): SmbFileShare = js.native
  def get(name: String, id: Input[ID], state: SmbFileShareState): SmbFileShare = js.native
  def get(name: String, id: Input[ID], state: SmbFileShareState, opts: CustomResourceOptions): SmbFileShare = js.native
  /**
    * Returns true if the given object is an instance of SmbFileShare.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/smbFileShare.SmbFileShare */ Boolean = js.native
}

