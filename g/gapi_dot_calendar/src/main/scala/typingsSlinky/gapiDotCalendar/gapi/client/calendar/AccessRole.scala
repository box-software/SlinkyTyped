package typingsSlinky.gapiDotCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The user's access role for this calendar. Read-only. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typings.gapiDotCalendar.gapiDotCalendarStrings.none
  - typings.gapiDotCalendar.gapiDotCalendarStrings.freeBusyReader
  - typings.gapiDotCalendar.gapiDotCalendarStrings.reader
  - typings.gapiDotCalendar.gapiDotCalendarStrings.writer
  - typings.gapiDotCalendar.gapiDotCalendarStrings.owner
*/
trait AccessRole extends js.Object

object AccessRole {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def freeBusyReader: typingsSlinky.gapiDotCalendar.gapiDotCalendarStrings.freeBusyReader = this.cast("freeBusyReader")
  @scala.inline
  def none: typingsSlinky.gapiDotCalendar.gapiDotCalendarStrings.none = this.cast("none")
  @scala.inline
  def owner: typingsSlinky.gapiDotCalendar.gapiDotCalendarStrings.owner = this.cast("owner")
  @scala.inline
  def reader: typingsSlinky.gapiDotCalendar.gapiDotCalendarStrings.reader = this.cast("reader")
  @scala.inline
  def writer: typingsSlinky.gapiDotCalendar.gapiDotCalendarStrings.writer = this.cast("writer")
}

