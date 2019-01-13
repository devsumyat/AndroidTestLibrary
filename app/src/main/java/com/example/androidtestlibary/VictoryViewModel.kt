package com.example.androidtestlibary

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestViewModel : ViewModel() {

  val viewState: MutableLiveData<TestModel> = MutableLiveData()
  lateinit var repository: TestRepository

  fun initialize() {
    val (title, count) = repository.getTestTitleAndCount()
    viewState.value = TestModel.TitleUpdated(title)
    viewState.value = TestModel.CountUpdated(count)
  }

  fun setTestTitle(title: String) {
    repository.setTestTitle(title)
    viewState.value = TestModel.TitleUpdated(title)
  }

  fun incrementTestCount() {
    val newCount = repository.getTestCount() + 1
    repository.setTestCount(newCount)
    viewState.value = TestModel.CountUpdated(newCount)
  }

  fun reset() {
    repository.clear()
  }
}
