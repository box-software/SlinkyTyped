package typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod

import typingsSlinky.atFirebaseFirestore.distSrcApiFieldUnderscorePathMod.FieldPath
import typingsSlinky.atFirebaseFirestore.distSrcModelDocumentMod.Document
import typingsSlinky.atFirebaseFirestore.distSrcModelDocumentUnderscoreKeyMod.DocumentKey
import typingsSlinky.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.FirestoreDataConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/database", "DocumentSnapshot")
@js.native
class DocumentSnapshot[T] protected ()
  extends typingsSlinky.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentSnapshot[T] {
  def this(
    _firestore: Firestore,
    _key: DocumentKey,
    _document: Null,
    _fromCache: Boolean,
    _hasPendingWrites: Boolean
  ) = this()
  def this(
    _firestore: Firestore,
    _key: DocumentKey,
    _document: Document,
    _fromCache: Boolean,
    _hasPendingWrites: Boolean
  ) = this()
  def this(
    _firestore: Firestore,
    _key: DocumentKey,
    _document: Null,
    _fromCache: Boolean,
    _hasPendingWrites: Boolean,
    _converter: FirestoreDataConverter[T]
  ) = this()
  def this(
    _firestore: Firestore,
    _key: DocumentKey,
    _document: Document,
    _fromCache: Boolean,
    _hasPendingWrites: Boolean,
    _converter: FirestoreDataConverter[T]
  ) = this()
  val _converter: js.UndefOr[js.Any] = js.native
  var _document: Document | Null = js.native
  var _firestore: js.Any = js.native
  var _fromCache: js.Any = js.native
  var _hasPendingWrites: js.Any = js.native
  var _key: js.Any = js.native
  var toJSArray: js.Any = js.native
  var toJSObject: js.Any = js.native
  var toJSValue: js.Any = js.native
  def get(fieldPath: FieldPath): js.Any = js.native
  def get(
    fieldPath: FieldPath,
    options: typingsSlinky.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.SnapshotOptions
  ): js.Any = js.native
}

