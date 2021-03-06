package typingsSlinky.atPulumiAws.ec2Mod

import typingsSlinky.atPulumiAws.ec2PlacementGroupMod.PlacementGroupArgs
import typingsSlinky.atPulumiAws.ec2PlacementGroupMod.PlacementGroupState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "PlacementGroup")
@js.native
class PlacementGroup protected ()
  extends typingsSlinky.atPulumiAws.ec2PlacementGroupMod.PlacementGroup {
  /**
    * Create a PlacementGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PlacementGroupArgs) = this()
  def this(name: String, args: PlacementGroupArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ec2", "PlacementGroup")
@js.native
object PlacementGroup extends js.Object {
  /**
    * Get an existing PlacementGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.ec2PlacementGroupMod.PlacementGroup = js.native
  def get(name: String, id: Input[ID], state: PlacementGroupState): typingsSlinky.atPulumiAws.ec2PlacementGroupMod.PlacementGroup = js.native
  def get(name: String, id: Input[ID], state: PlacementGroupState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.ec2PlacementGroupMod.PlacementGroup = js.native
  /**
    * Returns true if the given object is an instance of PlacementGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/placementGroup.PlacementGroup */ Boolean = js.native
}

