package typingsSlinky.atPulumiAws.atPulumiAwsMod.opsworks

import typingsSlinky.atPulumiAws.opsworksRdsDbInstanceMod.RdsDbInstanceArgs
import typingsSlinky.atPulumiAws.opsworksRdsDbInstanceMod.RdsDbInstanceState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "opsworks.RdsDbInstance")
@js.native
class RdsDbInstance protected ()
  extends typingsSlinky.atPulumiAws.opsworksMod.RdsDbInstance {
  /**
    * Create a RdsDbInstance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RdsDbInstanceArgs) = this()
  def this(name: String, args: RdsDbInstanceArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "opsworks.RdsDbInstance")
@js.native
object RdsDbInstance extends js.Object {
  /**
    * Get an existing RdsDbInstance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.opsworksRdsDbInstanceMod.RdsDbInstance = js.native
  def get(name: String, id: Input[ID], state: RdsDbInstanceState): typingsSlinky.atPulumiAws.opsworksRdsDbInstanceMod.RdsDbInstance = js.native
  def get(name: String, id: Input[ID], state: RdsDbInstanceState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.opsworksRdsDbInstanceMod.RdsDbInstance = js.native
  /**
    * Returns true if the given object is an instance of RdsDbInstance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/rdsDbInstance.RdsDbInstance */ Boolean = js.native
}

