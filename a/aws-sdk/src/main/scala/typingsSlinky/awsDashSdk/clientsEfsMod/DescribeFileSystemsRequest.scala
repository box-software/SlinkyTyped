package typingsSlinky.awsDashSdk.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFileSystemsRequest extends js.Object {
  /**
    * (Optional) Restricts the list to the file system with this creation token (String). You specify a creation token when you create an Amazon EFS file system.
    */
  var CreationToken: js.UndefOr[typingsSlinky.awsDashSdk.clientsEfsMod.CreationToken] = js.native
  /**
    * (Optional) ID of the file system whose description you want to retrieve (String).
    */
  var FileSystemId: js.UndefOr[typingsSlinky.awsDashSdk.clientsEfsMod.FileSystemId] = js.native
  /**
    * (Optional) Opaque pagination token returned from a previous DescribeFileSystems operation (String). If present, specifies to continue the list from where the returning call had left off. 
    */
  var Marker: js.UndefOr[typingsSlinky.awsDashSdk.clientsEfsMod.Marker] = js.native
  /**
    * (Optional) Specifies the maximum number of file systems to return in the response (integer). Currently, this number is automatically set to 10, and other values are ignored. The response is paginated at 10 per page if you have more than 10 file systems. 
    */
  var MaxItems: js.UndefOr[typingsSlinky.awsDashSdk.clientsEfsMod.MaxItems] = js.native
}

object DescribeFileSystemsRequest {
  @scala.inline
  def apply(
    CreationToken: CreationToken = null,
    FileSystemId: FileSystemId = null,
    Marker: Marker = null,
    MaxItems: Int | Double = null
  ): DescribeFileSystemsRequest = {
    val __obj = js.Dynamic.literal()
    if (CreationToken != null) __obj.updateDynamic("CreationToken")(CreationToken.asInstanceOf[js.Any])
    if (FileSystemId != null) __obj.updateDynamic("FileSystemId")(FileSystemId.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFileSystemsRequest]
  }
}

