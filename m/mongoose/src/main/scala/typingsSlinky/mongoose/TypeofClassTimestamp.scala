package typingsSlinky.mongoose

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.mongodb.mongodbMod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassTimestamp extends Instantiable0[Timestamp] {
  val MAX_VALUE: typingsSlinky.bson.bsonMod.Timestamp = js.native
  val MIN_VALUE: typingsSlinky.bson.bsonMod.Timestamp = js.native
  val NEG_ONE: typingsSlinky.bson.bsonMod.Timestamp = js.native
  val ONE: typingsSlinky.bson.bsonMod.Timestamp = js.native
  val ZERO: typingsSlinky.bson.bsonMod.Timestamp = js.native
  /**
    * Returns a Timestamp for the given high and low bits. Each is assumed to use 32 bits.
    * @param lowBits The low 32-bits.
    * @param highBits The high 32-bits.
    */
  def fromBits(lowBits: Double, highBits: Double): typingsSlinky.bson.bsonMod.Timestamp = js.native
  /** Returns a Timestamp represented by the given (32-bit) integer value */
  def fromInt(value: Double): typingsSlinky.bson.bsonMod.Timestamp = js.native
  /** Returns a Timestamp representing the given number value, provided that it is a finite number. */
  def fromNumber(value: Double): typingsSlinky.bson.bsonMod.Timestamp = js.native
  /**
    * Returns a Timestamp from the given string.
    * @param opt_radix The radix in which the text is written. {default:10}
    */
  def fromString(str: String): typingsSlinky.bson.bsonMod.Timestamp = js.native
  def fromString(str: String, opt_radix: Double): typingsSlinky.bson.bsonMod.Timestamp = js.native
}

