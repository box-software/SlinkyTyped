package typingsSlinky.atPulumiAws.iamMod

import typingsSlinky.atPulumiAws.iamInstanceProfileMod.InstanceProfileArgs
import typingsSlinky.atPulumiAws.iamInstanceProfileMod.InstanceProfileState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam", "InstanceProfile")
@js.native
class InstanceProfile protected ()
  extends typingsSlinky.atPulumiAws.iamInstanceProfileMod.InstanceProfile {
  /**
    * Create a InstanceProfile resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: InstanceProfileArgs) = this()
  def this(name: String, args: InstanceProfileArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/iam", "InstanceProfile")
@js.native
object InstanceProfile extends js.Object {
  /**
    * Get an existing InstanceProfile resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.iamInstanceProfileMod.InstanceProfile = js.native
  def get(name: String, id: Input[ID], state: InstanceProfileState): typingsSlinky.atPulumiAws.iamInstanceProfileMod.InstanceProfile = js.native
  def get(name: String, id: Input[ID], state: InstanceProfileState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.iamInstanceProfileMod.InstanceProfile = js.native
  /**
    * Returns true if the given object is an instance of InstanceProfile.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/instanceProfile.InstanceProfile */ Boolean = js.native
}

