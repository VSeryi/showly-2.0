package com.michaldrabik.ui_navigation.java

object NavigationArgs {
  const val ARG_ID = "ARG_ID"
  const val ARG_SHOW_ID = "ARG_SHOW_ID"
  const val ARG_MOVIE_ID = "ARG_MOVIE_ID"
  const val ARG_EPISODE_ID = "ARG_EPISODE_ID"
  const val ARG_COMMENT_ID = "ARG_COMMENT_ID"
  const val ARG_COLLECTION_ID = "ARG_COLLECTION_ID"
  const val ARG_PERSON = "ARG_PERSON"
  const val ARG_PERSON_ARGS = "ARG_PERSON_ARGS"
  const val ARG_OPTIONS = "ARG_OPTIONS"
  const val ARG_TITLE = "ARG_TITLE"
  const val ARG_ITEM = "ARG_ITEM"

  const val ARG_LIST = "ARG_LIST"
  const val ARG_COMMENT = "ARG_COMMENT"
  const val ARG_COMMENT_ACTION = "ARG_COMMENT_ACTION"
  const val ARG_FAMILY = "ARG_FAMILY"
  const val ARG_TYPE = "ARG_TYPE"
  const val ARG_DEPARTMENT = "ARG_DEPARTMENT"
  const val ARG_REPLY_USER = "ARG_REPLY_USER"
  const val ARG_REQUEST_KEY = "ARG_REQUEST_KEY"

  const val ARG_SORT_ORDERS = "ARG_SORT_ORDERS"
  const val ARG_SELECTED_SORT_ORDER = "ARG_SELECTED_SORT_ORDER"
  const val ARG_SELECTED_SORT_TYPE = "ARG_SELECTED_SORT_TYPE"
  const val ARG_SELECTED_NEW_AT_TOP = "ARG_SELECTED_NEW_AT_TOP"

  const val REQUEST_COMMENT = "REQUEST_COMMENT"
  const val REQUEST_EPISODE_DETAILS = "REQUEST_EPISODE_DETAILS"
  const val REQUEST_DETAILS = "REQUEST_DETAILS"
  const val REQUEST_SORT_ORDER = "REQUEST_SORT_ORDER"
  const val REQUEST_RATING = "REQUEST_RATING"
  fun requestSortOrderSection(section: String) = "REQUEST_SORT_ORDER_SECTION_$section"

  const val ACTION_NEW_COMMENT = "ACTION_NEW_COMMENT"
  const val ACTION_RATING_CHANGED = "ACTION_RATING_CHANGED"
  const val ACTION_EPISODE_WATCHED = "ACTION_EPISODE_WATCHED"
  const val ACTION_EPISODE_TAB_SELECTED = "ACTION_EPISODE_TAB_SELECTED"

  const val REQUEST_CREATE_LIST = "REQUEST_CREATE_LIST"
  const val REQUEST_MANAGE_LISTS = "REQUEST_MANAGE_LISTS"
  const val REQUEST_REMOVE_TRAKT = "REQUEST_REMOVE_TRAKT"
  const val REQUEST_ITEM_MENU = "REQUEST_ITEM_MENU"

  const val RESULT = "RESULT"
}