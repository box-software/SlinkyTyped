package typingsSlinky.apolloDashClient.coreWatchQueryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.apolloDashClient.apolloDashClientStrings.`cache-and-network`
  - typings.apolloDashClient.apolloDashClientStrings.`cache-first`
  - typings.apolloDashClient.apolloDashClientStrings.`network-only`
  - typings.apolloDashClient.apolloDashClientStrings.`cache-only`
  - typings.apolloDashClient.apolloDashClientStrings.`no-cache`
  - typings.apolloDashClient.apolloDashClientStrings.standby
*/
trait WatchQueryFetchPolicy extends js.Object

object WatchQueryFetchPolicy {
  @scala.inline
  def `cache-and-network`: typingsSlinky.apolloDashClient.apolloDashClientStrings.`cache-and-network` = this.cast("cache-and-network")
  @scala.inline
  def `cache-first`: typingsSlinky.apolloDashClient.apolloDashClientStrings.`cache-first` = this.cast("cache-first")
  @scala.inline
  def `cache-only`: typingsSlinky.apolloDashClient.apolloDashClientStrings.`cache-only` = this.cast("cache-only")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `network-only`: typingsSlinky.apolloDashClient.apolloDashClientStrings.`network-only` = this.cast("network-only")
  @scala.inline
  def `no-cache`: typingsSlinky.apolloDashClient.apolloDashClientStrings.`no-cache` = this.cast("no-cache")
  @scala.inline
  def standby: typingsSlinky.apolloDashClient.apolloDashClientStrings.standby = this.cast("standby")
}

