package typingsSlinky.awsDashSdk.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMountTargetRequest extends js.Object {
  /**
    * The ID of the file system for which to create the mount target.
    */
  var FileSystemId: typingsSlinky.awsDashSdk.clientsEfsMod.FileSystemId = js.native
  /**
    * Valid IPv4 address within the address range of the specified subnet.
    */
  var IpAddress: js.UndefOr[typingsSlinky.awsDashSdk.clientsEfsMod.IpAddress] = js.native
  /**
    * Up to five VPC security group IDs, of the form sg-xxxxxxxx. These must be for the same VPC as subnet specified.
    */
  var SecurityGroups: js.UndefOr[typingsSlinky.awsDashSdk.clientsEfsMod.SecurityGroups] = js.native
  /**
    * The ID of the subnet to add the mount target in.
    */
  var SubnetId: typingsSlinky.awsDashSdk.clientsEfsMod.SubnetId = js.native
}

object CreateMountTargetRequest {
  @scala.inline
  def apply(
    FileSystemId: FileSystemId,
    SubnetId: SubnetId,
    IpAddress: IpAddress = null,
    SecurityGroups: SecurityGroups = null
  ): CreateMountTargetRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any])
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMountTargetRequest]
  }
}

