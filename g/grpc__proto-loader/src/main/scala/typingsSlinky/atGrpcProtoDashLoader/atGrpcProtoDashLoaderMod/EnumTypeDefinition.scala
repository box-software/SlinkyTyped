package typingsSlinky.atGrpcProtoDashLoader.atGrpcProtoDashLoaderMod

import typingsSlinky.atGrpcProtoDashLoader.atGrpcProtoDashLoaderStrings.`Protocol Buffer 3 EnumDescriptorProto`
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumTypeDefinition
  extends ProtobufTypeDefinition
     with _AnyDefinition {
  @JSName("format")
  var format_EnumTypeDefinition: `Protocol Buffer 3 EnumDescriptorProto`
}

object EnumTypeDefinition {
  @scala.inline
  def apply(
    fileDescriptorProtos: js.Array[Buffer],
    format: `Protocol Buffer 3 EnumDescriptorProto`,
    `type`: js.Object
  ): EnumTypeDefinition = {
    val __obj = js.Dynamic.literal(fileDescriptorProtos = fileDescriptorProtos.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumTypeDefinition]
  }
}

