package typingsSlinky.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.braintree.braintreeStrings.authorization_expired
  - typings.braintree.braintreeStrings.authorized
  - typings.braintree.braintreeStrings.authorizing
  - typings.braintree.braintreeStrings.settlement_pending
  - typings.braintree.braintreeStrings.settlement_declined
  - typings.braintree.braintreeStrings.failed
  - typings.braintree.braintreeStrings.gateway_rejected
  - typings.braintree.braintreeStrings.processor_declined
  - typings.braintree.braintreeStrings.settled
  - typings.braintree.braintreeStrings.settling
  - typings.braintree.braintreeStrings.submitted_for_settlement
  - typings.braintree.braintreeStrings.voided
*/
trait TransactionStatus extends js.Object

object TransactionStatus {
  @scala.inline
  def authorization_expired: typingsSlinky.braintree.braintreeStrings.authorization_expired = this.cast("authorization_expired")
  @scala.inline
  def authorized: typingsSlinky.braintree.braintreeStrings.authorized = this.cast("authorized")
  @scala.inline
  def authorizing: typingsSlinky.braintree.braintreeStrings.authorizing = this.cast("authorizing")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: typingsSlinky.braintree.braintreeStrings.failed = this.cast("failed")
  @scala.inline
  def gateway_rejected: typingsSlinky.braintree.braintreeStrings.gateway_rejected = this.cast("gateway_rejected")
  @scala.inline
  def processor_declined: typingsSlinky.braintree.braintreeStrings.processor_declined = this.cast("processor_declined")
  @scala.inline
  def settled: typingsSlinky.braintree.braintreeStrings.settled = this.cast("settled")
  @scala.inline
  def settlement_declined: typingsSlinky.braintree.braintreeStrings.settlement_declined = this.cast("settlement_declined")
  @scala.inline
  def settlement_pending: typingsSlinky.braintree.braintreeStrings.settlement_pending = this.cast("settlement_pending")
  @scala.inline
  def settling: typingsSlinky.braintree.braintreeStrings.settling = this.cast("settling")
  @scala.inline
  def submitted_for_settlement: typingsSlinky.braintree.braintreeStrings.submitted_for_settlement = this.cast("submitted_for_settlement")
  @scala.inline
  def voided: typingsSlinky.braintree.braintreeStrings.voided = this.cast("voided")
}

