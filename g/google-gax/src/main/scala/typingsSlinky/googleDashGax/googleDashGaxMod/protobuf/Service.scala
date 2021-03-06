package typingsSlinky.googleDashGax.googleDashGaxMod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.protobufjsMod.IService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "protobuf.Service")
@js.native
class Service protected ()
  extends typingsSlinky.protobufjs.protobufjsMod.Service {
  /**
    * Constructs a new service instance.
    * @param name Service name
    * @param [options] Service options
    * @throws {TypeError} If arguments are invalid
    */
  def this(name: String) = this()
  def this(name: String, options: StringDictionary[js.Any]) = this()
}

/* static members */
@JSImport("google-gax", "protobuf.Service")
@js.native
object Service extends js.Object {
  /**
    * Constructs a service from a service descriptor.
    * @param name Service name
    * @param json Service descriptor
    * @returns Created service
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: String, json: IService): typingsSlinky.protobufjs.protobufjsMod.Service = js.native
}

