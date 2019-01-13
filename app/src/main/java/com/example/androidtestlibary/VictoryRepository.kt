package com.example.androidtestlibary

interface TestRepository {
  fun getTestTitleAndCount(): Pair<String, Int>
  fun setTestTitle(title: String)
  fun getTestTitle(): String
  fun setTestCount(count: Int)
  fun getTestCount(): Int
  fun clear()
}