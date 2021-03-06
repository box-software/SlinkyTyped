package typingsSlinky.draftDashJs.draftDashJsMod

import typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.Constants.DraftBlockType
import typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.DraftInlineStyle
import typingsSlinky.immutable.Immutable.List
import typingsSlinky.immutable.Immutable.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "ContentBlock")
@js.native
class ContentBlock ()
  extends typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock {
  /**
    * Execute a callback for every contiguous range of entities within the block.
    */
  /* CompleteClass */
  override def findEntityRanges(
    filterFn: js.Function1[
      /* value */ typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.CharacterMetadata, 
      Boolean
    ],
    callback: js.Function2[/* start */ Double, /* end */ Double, Unit]
  ): Unit = js.native
  /**
    * Execute a callback for every contiguous range of styles within the block.
    */
  /* CompleteClass */
  override def findStyleRanges(
    filterFn: js.Function1[
      /* value */ typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.CharacterMetadata, 
      Boolean
    ],
    callback: js.Function2[/* start */ Double, /* end */ Double, Unit]
  ): Unit = js.native
  /* CompleteClass */
  override def getCharacterList(): List[
    typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.CharacterMetadata
  ] = js.native
  /* CompleteClass */
  override def getData(): Map[_, _] = js.native
  /* CompleteClass */
  override def getDepth(): Double = js.native
  /* CompleteClass */
  override def getEntityAt(offset: Double): String = js.native
  /* CompleteClass */
  override def getInlineStyleAt(offset: Double): DraftInlineStyle = js.native
  /* CompleteClass */
  override def getKey(): String = js.native
  /* CompleteClass */
  override def getLength(): Double = js.native
  /* CompleteClass */
  override def getText(): String = js.native
  /* CompleteClass */
  override def getType(): DraftBlockType = js.native
}

