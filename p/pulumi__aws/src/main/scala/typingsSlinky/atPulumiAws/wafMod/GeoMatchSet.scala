package typingsSlinky.atPulumiAws.wafMod

import typingsSlinky.atPulumiAws.wafGeoMatchSetMod.GeoMatchSetArgs
import typingsSlinky.atPulumiAws.wafGeoMatchSetMod.GeoMatchSetState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/waf", "GeoMatchSet")
@js.native
class GeoMatchSet protected ()
  extends typingsSlinky.atPulumiAws.wafGeoMatchSetMod.GeoMatchSet {
  /**
    * Create a GeoMatchSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: GeoMatchSetArgs) = this()
  def this(name: String, args: GeoMatchSetArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/waf", "GeoMatchSet")
@js.native
object GeoMatchSet extends js.Object {
  /**
    * Get an existing GeoMatchSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.wafGeoMatchSetMod.GeoMatchSet = js.native
  def get(name: String, id: Input[ID], state: GeoMatchSetState): typingsSlinky.atPulumiAws.wafGeoMatchSetMod.GeoMatchSet = js.native
  def get(name: String, id: Input[ID], state: GeoMatchSetState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.wafGeoMatchSetMod.GeoMatchSet = js.native
  /**
    * Returns true if the given object is an instance of GeoMatchSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/geoMatchSet.GeoMatchSet */ Boolean = js.native
}

