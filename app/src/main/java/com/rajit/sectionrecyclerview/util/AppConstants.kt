package com.rajit.sectionrecyclerview.util

import com.rajit.sectionrecyclerview.model.ChildData
import com.rajit.sectionrecyclerview.model.ParentData

object AppConstants {

    val data = listOf<ParentData>(
        ParentData(
            "Section 1",
            listOf(
                ChildData("One"),
                ChildData("Two"),
                ChildData("Three"),
                ChildData("Four")
            )
        ),

        ParentData(
            "Section 2",
            listOf(
                ChildData("One"),
                ChildData("Two"),
                ChildData("Three"),
                ChildData("Four"),
                ChildData("Five"),
                ChildData("Six"),
                ChildData("Seven")
            )
        ),

        ParentData(
            "Section 3",
            listOf(
                ChildData("One"),
                ChildData("Two")
            )
        ),

        ParentData(
            "Section 4",
            listOf(
                ChildData("One"),
                ChildData("Two"),
                ChildData("Three"),
                ChildData("Four"),
                ChildData("Five")
            )
        ),

        ParentData(
            "Section 5",
            mutableListOf(
                ChildData(data = "One")
            )
        ),

        ParentData(
            "Section 6",
            listOf(
                ChildData("One"),
                ChildData("Two"),
                ChildData("Three"),
                ChildData("Four"),
                ChildData("Five"),
                ChildData("Six"),
                ChildData("Seven"),
                ChildData("Eight"),
                ChildData("Nine"),
                ChildData("Ten"),
                ChildData("Eleven"),
                ChildData("Twelve"),
                ChildData("Thirteen"),
                ChildData("Fourteen"),
                ChildData("Fifteen"),
                ChildData("Sixteen"),
                ChildData("Seventeen"),
                ChildData("Eighteen"),
                ChildData("Nineteen"),
                ChildData("Twenty")
            )
        ),

        ParentData(
            "Section 7",
            listOf(
                ChildData("One"),
                ChildData("Two"),
                ChildData("Three"),
                ChildData("Four"),
                ChildData("Five"),
                ChildData("Six"),
                ChildData("Seven")
            )
        ),

        ParentData(
            "Section 8",
            listOf(
                ChildData("One"),
                ChildData("Two"),
                ChildData("Three"),
                ChildData("Four"),
                ChildData("Five"),
                ChildData("Six"),
                ChildData("Seven"),
                ChildData("Eight")
            )
        ),

        ParentData(
            "Section 9",
            listOf(
                ChildData("One"),
                ChildData("Two"),
                ChildData("Three")
            )
        ),

        ParentData(
            "Section 10",
            listOf(
                ChildData("One"),
                ChildData("Two"),
                ChildData("Three"),
                ChildData("Four")
            )
        )
    )

}