package typingsSlinky.atPulumiAws.ec2LaunchTemplateMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atPulumiAws.typesOutputMod.ec2.LaunchTemplateBlockDeviceMapping
import typingsSlinky.atPulumiAws.typesOutputMod.ec2.LaunchTemplateCapacityReservationSpecification
import typingsSlinky.atPulumiAws.typesOutputMod.ec2.LaunchTemplateCreditSpecification
import typingsSlinky.atPulumiAws.typesOutputMod.ec2.LaunchTemplateElasticGpuSpecification
import typingsSlinky.atPulumiAws.typesOutputMod.ec2.LaunchTemplateElasticInferenceAccelerator
import typingsSlinky.atPulumiAws.typesOutputMod.ec2.LaunchTemplateIamInstanceProfile
import typingsSlinky.atPulumiAws.typesOutputMod.ec2.LaunchTemplateInstanceMarketOptions
import typingsSlinky.atPulumiAws.typesOutputMod.ec2.LaunchTemplateLicenseSpecification
import typingsSlinky.atPulumiAws.typesOutputMod.ec2.LaunchTemplateMonitoring
import typingsSlinky.atPulumiAws.typesOutputMod.ec2.LaunchTemplateNetworkInterface
import typingsSlinky.atPulumiAws.typesOutputMod.ec2.LaunchTemplatePlacement
import typingsSlinky.atPulumiAws.typesOutputMod.ec2.LaunchTemplateTagSpecification
import typingsSlinky.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.outputMod.Output
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/launchTemplate", "LaunchTemplate")
@js.native
class LaunchTemplate protected () extends CustomResource {
  /**
    * Create a LaunchTemplate resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: LaunchTemplateArgs) = this()
  def this(name: String, args: LaunchTemplateArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of the launch template.
    */
  val arn: Output[String] = js.native
  /**
    * Specify volumes to attach to the instance besides the volumes specified by the AMI.
    * See Block Devices below for details.
    */
  val blockDeviceMappings: Output[js.UndefOr[js.Array[LaunchTemplateBlockDeviceMapping]]] = js.native
  /**
    * Targeting for EC2 capacity reservations. See Capacity Reservation Specification below for more details.
    */
  val capacityReservationSpecification: Output[js.UndefOr[LaunchTemplateCapacityReservationSpecification]] = js.native
  /**
    * Customize the credit specification of the instance. See Credit
    * Specification below for more details.
    */
  val creditSpecification: Output[js.UndefOr[LaunchTemplateCreditSpecification]] = js.native
  /**
    * The default version of the launch template.
    */
  val defaultVersion: Output[Double] = js.native
  /**
    * Description of the launch template.
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * If `true`, enables [EC2 Instance
    * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
    */
  val disableApiTermination: Output[js.UndefOr[Boolean]] = js.native
  /**
    * If `true`, the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: Output[js.UndefOr[String]] = js.native
  /**
    * The elastic GPU to attach to the instance. See Elastic GPU
    * below for more details.
    */
  val elasticGpuSpecifications: Output[js.UndefOr[js.Array[LaunchTemplateElasticGpuSpecification]]] = js.native
  /**
    * Configuration block containing an Elastic Inference Accelerator to attach to the instance. See Elastic Inference Accelerator below for more details.
    */
  val elasticInferenceAccelerator: Output[js.UndefOr[LaunchTemplateElasticInferenceAccelerator]] = js.native
  /**
    * The IAM Instance Profile to launch the instance with. See Instance Profile
    * below for more details.
    */
  val iamInstanceProfile: Output[js.UndefOr[LaunchTemplateIamInstanceProfile]] = js.native
  /**
    * The AMI from which to launch the instance.
    */
  val imageId: Output[js.UndefOr[String]] = js.native
  /**
    * Shutdown behavior for the instance. Can be `stop` or `terminate`.
    * (Default: `stop`).
    */
  val instanceInitiatedShutdownBehavior: Output[js.UndefOr[String]] = js.native
  /**
    * The market (purchasing) option for the instance. See Market Options
    * below for details.
    */
  val instanceMarketOptions: Output[js.UndefOr[LaunchTemplateInstanceMarketOptions]] = js.native
  /**
    * The type of the instance.
    */
  val instanceType: Output[js.UndefOr[String]] = js.native
  /**
    * The kernel ID.
    */
  val kernelId: Output[js.UndefOr[String]] = js.native
  /**
    * The key name to use for the instance.
    */
  val keyName: Output[js.UndefOr[String]] = js.native
  /**
    * The latest version of the launch template.
    */
  val latestVersion: Output[Double] = js.native
  /**
    * A list of license specifications to associate with. See License Specification below for more details.
    */
  val licenseSpecifications: Output[js.UndefOr[js.Array[LaunchTemplateLicenseSpecification]]] = js.native
  /**
    * The monitoring option for the instance. See Monitoring below for more details.
    */
  val monitoring: Output[js.UndefOr[LaunchTemplateMonitoring]] = js.native
  /**
    * The name of the launch template. If you leave this blank, this provider will auto-generate a unique name.
    */
  val name: Output[String] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: Output[js.UndefOr[String]] = js.native
  /**
    * Customize network interfaces to be attached at instance boot time. See Network
    * Interfaces below for more details.
    */
  val networkInterfaces: Output[js.UndefOr[js.Array[LaunchTemplateNetworkInterface]]] = js.native
  /**
    * The placement of the instance. See Placement below for more details.
    */
  val placement: Output[js.UndefOr[LaunchTemplatePlacement]] = js.native
  /**
    * The ID of the RAM disk.
    */
  val ramDiskId: Output[js.UndefOr[String]] = js.native
  /**
    * A list of security group names to associate with. If you are creating Instances in a VPC, use
    * `vpcSecurityGroupIds` instead.
    */
  val securityGroupNames: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The tags to apply to the resources during launch. See Tag Specifications below for more details.
    */
  val tagSpecifications: Output[js.UndefOr[js.Array[LaunchTemplateTagSpecification]]] = js.native
  /**
    * A mapping of tags to assign to the launch template.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The Base64-encoded user data to provide when launching the instance.
    */
  val userData: Output[js.UndefOr[String]] = js.native
  /**
    * A list of security group IDs to associate with.
    */
  val vpcSecurityGroupIds: Output[js.UndefOr[js.Array[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/launchTemplate", "LaunchTemplate")
@js.native
object LaunchTemplate extends js.Object {
  /**
    * Get an existing LaunchTemplate resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): LaunchTemplate = js.native
  def get(name: String, id: Input[ID], state: LaunchTemplateState): LaunchTemplate = js.native
  def get(name: String, id: Input[ID], state: LaunchTemplateState, opts: CustomResourceOptions): LaunchTemplate = js.native
  /**
    * Returns true if the given object is an instance of LaunchTemplate.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/launchTemplate.LaunchTemplate */ Boolean = js.native
}

