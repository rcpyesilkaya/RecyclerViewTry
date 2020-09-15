package com.recepyesilkaya.recyclerviewtry.mock

import com.recepyesilkaya.recyclerviewtry.model.JobModel

object mock {

    fun getList(): List<JobModel> {

        val model = JobModel("Recep", "Student", "550 TL")
        val model1 = JobModel("Ali", "Doctor", "7550 TL")
        val model2 = JobModel("Ayşe", "Teacher", "5400 TL")
        val model3 = JobModel("Hilal", "Engineer", "9000 TL")
        val model4 = JobModel("İbrahim", "Lawyer", "6750 TL")
        val model5 = JobModel("Hatice", "Nurse", "4800 TL")
        val model6 = JobModel("Mahmut", "Police", "9000 TL")
        val model7 = JobModel("Serhat", "Soldier", "9000 TL")
        val model8 = JobModel("Ahmet", "Actor", "4800 TL")
        val model9 = JobModel("Mehmet", "Advertiser", "5000 TL")
        val model10 = JobModel("Esma", "Assistant", "6000 TL")
        val model11 = JobModel("Yüsra", "Author", "7000 TL")

        val jobList: ArrayList<JobModel> = ArrayList<JobModel>()

        jobList.add(model)
        jobList.add(model1)
        jobList.add(model2)
        jobList.add(model3)
        jobList.add(model4)
        jobList.add(model5)
        jobList.add(model6)
        jobList.add(model7)
        jobList.add(model8)
        jobList.add(model9)
        jobList.add(model10)
        jobList.add(model11)

        return jobList

    }

}