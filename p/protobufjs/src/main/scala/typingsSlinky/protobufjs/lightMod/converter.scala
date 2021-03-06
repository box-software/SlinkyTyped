package typingsSlinky.protobufjs.lightMod

import typingsSlinky.protobufjs.protobufjsMod.Codegen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/light", "converter")
@js.native
object converter extends js.Object {
  /**
    * Generates a plain object to runtime message converter specific to the specified message type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  def fromObject(mtype: typingsSlinky.protobufjs.protobufjsMod.Type): Codegen = js.native
  /**
    * Generates a runtime message to plain object converter specific to the specified message type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  def toObject(mtype: typingsSlinky.protobufjs.protobufjsMod.Type): Codegen = js.native
}

