package typingsSlinky.atPulumiAws.atPulumiAwsMod.ec2

import typingsSlinky.atPulumiAws.ec2GetLaunchConfigurationMod.GetLaunchConfigurationArgs
import typingsSlinky.atPulumiAws.ec2GetLaunchConfigurationMod.GetLaunchConfigurationResult
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getLaunchConfiguration")
@js.native
object getLaunchConfiguration extends js.Object {
  def apply(args: GetLaunchConfigurationArgs): js.Promise[GetLaunchConfigurationResult] with GetLaunchConfigurationResult = js.native
  def apply(args: GetLaunchConfigurationArgs, opts: InvokeOptions): js.Promise[GetLaunchConfigurationResult] with GetLaunchConfigurationResult = js.native
}

