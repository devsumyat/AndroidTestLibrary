package com.example.androidtestlibary

sealed class TestModel {

  data class TitleUpdated(val title: String) : TestModel()

  data class CountUpdated(val count: Int) : TestModel()
}