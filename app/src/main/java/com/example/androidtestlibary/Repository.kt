package com.example.androidtestlibary

import android.content.Context

open class Repository(context: Context) : TestRepository {
  companion object {

    private const val PACKAGE_NAME = "com.example.androidtestlibary"
    private const val KEY_VICTORY_TITLE = "victory_title"
    private const val KEY_VICTORY_COUNT = "victory_count"
  }

  private val sharedPreferences = context.getSharedPreferences(PACKAGE_NAME, Context.MODE_PRIVATE)

  override fun getTestTitleAndCount(): Pair<String, Int> {
    return Pair(getTestTitle(), getTestCount())
  }

  override fun setTestTitle(title: String) {
    sharedPreferences.edit().putString(KEY_VICTORY_TITLE, title).apply()
  }

  override fun getTestTitle(): String {
    return sharedPreferences.getString(KEY_VICTORY_TITLE, "Test title")
  }

  override fun setTestCount(count: Int) {
    sharedPreferences.edit().putInt(KEY_VICTORY_COUNT, count).apply()
  }

  override fun getTestCount(): Int {
    return sharedPreferences.getInt(KEY_VICTORY_COUNT, 0)
  }

  override fun clear() {
    sharedPreferences.edit().clear().apply()
  }
}