package typingsSlinky.atPulumiAws.ec2DefaultVpcDhcpOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.outputMod.Output
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/defaultVpcDhcpOptions", "DefaultVpcDhcpOptions")
@js.native
class DefaultVpcDhcpOptions protected () extends CustomResource {
  /**
    * Create a DefaultVpcDhcpOptions resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: DefaultVpcDhcpOptionsArgs) = this()
  def this(name: String, args: DefaultVpcDhcpOptionsArgs, opts: CustomResourceOptions) = this()
  val domainName: Output[String] = js.native
  val domainNameServers: Output[String] = js.native
  /**
    * List of NETBIOS name servers.
    */
  val netbiosNameServers: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
    */
  val netbiosNodeType: Output[js.UndefOr[String]] = js.native
  val ntpServers: Output[String] = js.native
  /**
    * The ID of the AWS account that owns the DHCP options set.
    */
  val ownerId: Output[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/defaultVpcDhcpOptions", "DefaultVpcDhcpOptions")
@js.native
object DefaultVpcDhcpOptions extends js.Object {
  /**
    * Get an existing DefaultVpcDhcpOptions resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): DefaultVpcDhcpOptions = js.native
  def get(name: String, id: Input[ID], state: DefaultVpcDhcpOptionsState): DefaultVpcDhcpOptions = js.native
  def get(name: String, id: Input[ID], state: DefaultVpcDhcpOptionsState, opts: CustomResourceOptions): DefaultVpcDhcpOptions = js.native
  /**
    * Returns true if the given object is an instance of DefaultVpcDhcpOptions.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultVpcDhcpOptions.DefaultVpcDhcpOptions */ Boolean = js.native
}

