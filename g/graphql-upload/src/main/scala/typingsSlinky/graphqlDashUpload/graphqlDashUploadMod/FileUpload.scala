package typingsSlinky.graphqlDashUpload.graphqlDashUploadMod

import typingsSlinky.fsDashCapacitor.fsDashCapacitorMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUpload extends js.Object {
  var encoding: String
  var filename: String
  var mimetype: String
  def createReadStream(): ReadStream
}

object FileUpload {
  @scala.inline
  def apply(createReadStream: () => ReadStream, encoding: String, filename: String, mimetype: String): FileUpload = {
    val __obj = js.Dynamic.literal(createReadStream = js.Any.fromFunction0(createReadStream), encoding = encoding.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileUpload]
  }
}

