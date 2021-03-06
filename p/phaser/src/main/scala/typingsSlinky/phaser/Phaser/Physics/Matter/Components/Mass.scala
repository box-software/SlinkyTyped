package typingsSlinky.phaser.Phaser.Physics.Matter.Components

import typingsSlinky.phaser.Phaser.GameObjects.GameObject
import typingsSlinky.phaser.Phaser.Math.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows accessing the mass, density, and center of mass of a Matter-enabled Game Object. Should be used as a mixin and not directly.
  */
trait Mass extends js.Object {
  /**
    * The body's center of mass.
    */
  val centerOfMass: Vector2
  /**
    * Sets density of the body.
    * @param value The new density of the body.
    */
  def setDensity(value: Double): GameObject
  /**
    * Sets the mass of the Game Object's Matter Body.
    * @param value The new mass of the body.
    */
  def setMass(value: Double): GameObject
}

object Mass {
  @scala.inline
  def apply(centerOfMass: Vector2, setDensity: Double => GameObject, setMass: Double => GameObject): Mass = {
    val __obj = js.Dynamic.literal(centerOfMass = centerOfMass.asInstanceOf[js.Any], setDensity = js.Any.fromFunction1(setDensity), setMass = js.Any.fromFunction1(setMass))
  
    __obj.asInstanceOf[Mass]
  }
}

