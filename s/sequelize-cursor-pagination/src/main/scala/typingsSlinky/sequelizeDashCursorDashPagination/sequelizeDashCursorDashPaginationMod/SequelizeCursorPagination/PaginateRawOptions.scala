package typingsSlinky.sequelizeDashCursorDashPagination.sequelizeDashCursorDashPaginationMod.SequelizeCursorPagination

import typingsSlinky.sequelize.Anon_Exclude
import typingsSlinky.sequelize.sequelizeMod.FindOptionsAttributesArray
import typingsSlinky.sequelize.sequelizeMod.IncludeOptions
import typingsSlinky.sequelize.sequelizeMod.Model
import typingsSlinky.sequelize.sequelizeMod.WhereOptions
import typingsSlinky.sequelize.sequelizeMod.and
import typingsSlinky.sequelize.sequelizeMod.col
import typingsSlinky.sequelize.sequelizeMod.fn
import typingsSlinky.sequelize.sequelizeMod.or
import typingsSlinky.sequelize.sequelizeMod.where
import typingsSlinky.sequelizeDashCursorDashPagination.sequelizeDashCursorDashPaginationBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginateRawOptions[T] extends BasicPaginateOptions[T] {
  var raw: `true`
}

object PaginateRawOptions {
  @scala.inline
  def apply[T](
    raw: `true`,
    after: String = null,
    attributes: FindOptionsAttributesArray | Anon_Exclude = null,
    before: String = null,
    desc: js.UndefOr[Boolean] = js.undefined,
    include: js.Array[(Model[_, _, _]) | IncludeOptions] = null,
    limit: Int | Double = null,
    paginationField: String = null,
    subQuery: js.UndefOr[Boolean] = js.undefined,
    where: WhereOptions[T] | where | fn | (js.Array[col | and | or | String]) = null
  ): PaginateRawOptions[T] = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (!js.isUndefined(desc)) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (paginationField != null) __obj.updateDynamic("paginationField")(paginationField.asInstanceOf[js.Any])
    if (!js.isUndefined(subQuery)) __obj.updateDynamic("subQuery")(subQuery.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginateRawOptions[T]]
  }
}

