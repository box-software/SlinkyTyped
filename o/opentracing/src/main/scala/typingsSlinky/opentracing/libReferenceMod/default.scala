package typingsSlinky.opentracing.libReferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/reference", JSImport.Default)
@js.native
class default protected () extends Reference {
  def this(`type`: String, referencedContext: typingsSlinky.opentracing.libSpanMod.default) = this()
  /**
    * Initialize a new Reference instance.
    *
    * @param {string} type - the Reference type constant (e.g.,
    *        REFERENCE_CHILD_OF or REFERENCE_FOLLOWS_FROM).
    * @param {SpanContext} referencedContext - the SpanContext being referred
    *        to. As a convenience, a Span instance may be passed in instead
    *        (in which case its .context() is used here).
    */
  def this(`type`: String, referencedContext: typingsSlinky.opentracing.libSpanUnderscoreContextMod.default) = this()
  /* CompleteClass */
  override var _referencedContext: typingsSlinky.opentracing.libSpanUnderscoreContextMod.default = js.native
  /* CompleteClass */
  override var _type: String = js.native
  /**
    * @return {SpanContext} The SpanContext being referred to (e.g., the
    *         parent in a REFERENCE_CHILD_OF Reference).
    */
  /* CompleteClass */
  override def referencedContext(): typingsSlinky.opentracing.libSpanUnderscoreContextMod.default = js.native
  /**
    * @return {string} The Reference type (e.g., REFERENCE_CHILD_OF or
    *         REFERENCE_FOLLOWS_FROM).
    */
  /* CompleteClass */
  override def `type`(): String = js.native
}

