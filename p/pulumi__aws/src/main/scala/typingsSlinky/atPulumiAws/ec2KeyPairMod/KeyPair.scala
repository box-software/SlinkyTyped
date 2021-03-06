package typingsSlinky.atPulumiAws.ec2KeyPairMod

import typingsSlinky.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.outputMod.Output
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/keyPair", "KeyPair")
@js.native
class KeyPair protected () extends CustomResource {
  /**
    * Create a KeyPair resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: KeyPairArgs) = this()
  def this(name: String, args: KeyPairArgs, opts: CustomResourceOptions) = this()
  /**
    * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
    */
  val fingerprint: Output[String] = js.native
  /**
    * The name for the key pair.
    */
  val keyName: Output[String] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `keyName`.
    */
  val keyNamePrefix: Output[js.UndefOr[String]] = js.native
  /**
    * The public key material.
    */
  val publicKey: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/keyPair", "KeyPair")
@js.native
object KeyPair extends js.Object {
  /**
    * Get an existing KeyPair resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): KeyPair = js.native
  def get(name: String, id: Input[ID], state: KeyPairState): KeyPair = js.native
  def get(name: String, id: Input[ID], state: KeyPairState, opts: CustomResourceOptions): KeyPair = js.native
  /**
    * Returns true if the given object is an instance of KeyPair.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/keyPair.KeyPair */ Boolean = js.native
}

