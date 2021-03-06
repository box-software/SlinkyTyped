package typingsSlinky.atPulumiAws.sesMod

import typingsSlinky.atPulumiAws.sesConfgurationSetMod.ConfgurationSetArgs
import typingsSlinky.atPulumiAws.sesConfgurationSetMod.ConfgurationSetState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ses", "ConfgurationSet")
@js.native
class ConfgurationSet protected ()
  extends typingsSlinky.atPulumiAws.sesConfgurationSetMod.ConfgurationSet {
  /**
    * Create a ConfgurationSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ConfgurationSetArgs) = this()
  def this(name: String, args: ConfgurationSetArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ses", "ConfgurationSet")
@js.native
object ConfgurationSet extends js.Object {
  /**
    * Get an existing ConfgurationSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.sesConfgurationSetMod.ConfgurationSet = js.native
  def get(name: String, id: Input[ID], state: ConfgurationSetState): typingsSlinky.atPulumiAws.sesConfgurationSetMod.ConfgurationSet = js.native
  def get(name: String, id: Input[ID], state: ConfgurationSetState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.sesConfgurationSetMod.ConfgurationSet = js.native
  /**
    * Returns true if the given object is an instance of ConfgurationSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/confgurationSet.ConfgurationSet */ Boolean = js.native
}

