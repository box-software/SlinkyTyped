package typingsSlinky.protobufjs.lightMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.protobufjsMod.Codegen
import typingsSlinky.protobufjs.protobufjsMod.IType
import typingsSlinky.protobufjs.protobufjsMod.TypeDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/light", "Type")
@js.native
class Type protected ()
  extends typingsSlinky.protobufjs.protobufjsMod.Type {
  /**
    * Constructs a new reflected message type instance.
    * @param name Message name
    * @param [options] Declared options
    */
  def this(name: String) = this()
  def this(name: String, options: StringDictionary[js.Any]) = this()
}

/* static members */
@JSImport("protobufjs/light", "Type")
@js.native
object Type extends js.Object {
  /**
    * Type decorator (TypeScript).
    * @param [typeName] Type name, defaults to the constructor's name
    * @returns Decorator function
    */
  def d[T /* <: typingsSlinky.protobufjs.protobufjsMod.Message[T] */](): TypeDecorator[T] = js.native
  def d[T /* <: typingsSlinky.protobufjs.protobufjsMod.Message[T] */](typeName: String): TypeDecorator[T] = js.native
  /**
    * Creates a message type from a message type descriptor.
    * @param name Message name
    * @param json Message type descriptor
    * @returns Created message type
    */
  def fromJSON(name: String, json: IType): typingsSlinky.protobufjs.protobufjsMod.Type = js.native
  /**
    * Generates a constructor function for the specified type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  def generateConstructor(mtype: typingsSlinky.protobufjs.protobufjsMod.Type): Codegen = js.native
}

