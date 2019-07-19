package rdc.move_test.util

import rdc.move_test.model.Property

interface TestAdapterContract {
    fun setListItems(listItems: List<Property>)
}