package typingsSlinky.atPulumiAws.ec2Mod

import typingsSlinky.atPulumiAws.ec2MainRouteTableAssociationMod.MainRouteTableAssociationArgs
import typingsSlinky.atPulumiAws.ec2MainRouteTableAssociationMod.MainRouteTableAssociationState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "MainRouteTableAssociation")
@js.native
class MainRouteTableAssociation protected ()
  extends typingsSlinky.atPulumiAws.ec2MainRouteTableAssociationMod.MainRouteTableAssociation {
  /**
    * Create a MainRouteTableAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: MainRouteTableAssociationArgs) = this()
  def this(name: String, args: MainRouteTableAssociationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ec2", "MainRouteTableAssociation")
@js.native
object MainRouteTableAssociation extends js.Object {
  /**
    * Get an existing MainRouteTableAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.ec2MainRouteTableAssociationMod.MainRouteTableAssociation = js.native
  def get(name: String, id: Input[ID], state: MainRouteTableAssociationState): typingsSlinky.atPulumiAws.ec2MainRouteTableAssociationMod.MainRouteTableAssociation = js.native
  def get(name: String, id: Input[ID], state: MainRouteTableAssociationState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.ec2MainRouteTableAssociationMod.MainRouteTableAssociation = js.native
  /**
    * Returns true if the given object is an instance of MainRouteTableAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/mainRouteTableAssociation.MainRouteTableAssociation */ Boolean = js.native
}

