package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Calendar

import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a guest of an event.
  */
trait EventGuest extends js.Object {
  def getAdditionalGuests(): Integer
  def getEmail(): String
  def getGuestStatus(): GuestStatus
  def getName(): String
  /** @deprecated DO NOT USE */ def getStatus(): String
}

object EventGuest {
  @scala.inline
  def apply(
    getAdditionalGuests: () => Integer,
    getEmail: () => String,
    getGuestStatus: () => GuestStatus,
    getName: () => String,
    getStatus: () => String
  ): EventGuest = {
    val __obj = js.Dynamic.literal(getAdditionalGuests = js.Any.fromFunction0(getAdditionalGuests), getEmail = js.Any.fromFunction0(getEmail), getGuestStatus = js.Any.fromFunction0(getGuestStatus), getName = js.Any.fromFunction0(getName), getStatus = js.Any.fromFunction0(getStatus))
  
    __obj.asInstanceOf[EventGuest]
  }
}

