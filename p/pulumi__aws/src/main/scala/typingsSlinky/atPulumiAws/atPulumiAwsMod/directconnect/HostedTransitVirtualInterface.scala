package typingsSlinky.atPulumiAws.atPulumiAwsMod.directconnect

import typingsSlinky.atPulumiAws.directconnectHostedTransitVirtualInterfaceMod.HostedTransitVirtualInterfaceArgs
import typingsSlinky.atPulumiAws.directconnectHostedTransitVirtualInterfaceMod.HostedTransitVirtualInterfaceState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "directconnect.HostedTransitVirtualInterface")
@js.native
class HostedTransitVirtualInterface protected ()
  extends typingsSlinky.atPulumiAws.directconnectMod.HostedTransitVirtualInterface {
  /**
    * Create a HostedTransitVirtualInterface resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: HostedTransitVirtualInterfaceArgs) = this()
  def this(name: String, args: HostedTransitVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "directconnect.HostedTransitVirtualInterface")
@js.native
object HostedTransitVirtualInterface extends js.Object {
  /**
    * Get an existing HostedTransitVirtualInterface resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.directconnectHostedTransitVirtualInterfaceMod.HostedTransitVirtualInterface = js.native
  def get(name: String, id: Input[ID], state: HostedTransitVirtualInterfaceState): typingsSlinky.atPulumiAws.directconnectHostedTransitVirtualInterfaceMod.HostedTransitVirtualInterface = js.native
  def get(
    name: String,
    id: Input[ID],
    state: HostedTransitVirtualInterfaceState,
    opts: CustomResourceOptions
  ): typingsSlinky.atPulumiAws.directconnectHostedTransitVirtualInterfaceMod.HostedTransitVirtualInterface = js.native
  /**
    * Returns true if the given object is an instance of HostedTransitVirtualInterface.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedTransitVirtualInterface.HostedTransitVirtualInterface */ Boolean = js.native
}

