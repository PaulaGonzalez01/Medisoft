package paula.espol.pasantias.medisoft.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import paula.espol.pasantias.medisoft.R
import paula.espol.pasantias.medisoft.adapters.OptionAdapter
import paula.espol.pasantias.medisoft.model.OptionMenu

class Grid : Fragment() {

    private var recyclerView: RecyclerView ? = null
    private var gridLayoutManager: GridLayoutManager ? = null
    private var arrayList: ArrayList<OptionMenu> ? = null
    private var optionAdapter: OptionAdapter ? =  null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_grid, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recyler_view_home)
        gridLayoutManager = GridLayoutManager(requireActivity().applicationContext,2,LinearLayoutManager.VERTICAL,false)

        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        arrayList = setDataInList()
        optionAdapter = OptionAdapter(requireActivity().applicationContext, arrayList!!)

        recyclerView?.adapter = optionAdapter
        recyclerView?.adapter?.notifyDataSetChanged()

    }

    private fun setDataInList() : ArrayList<OptionMenu>{
        var items : ArrayList<OptionMenu> = ArrayList()

        items.add(OptionMenu(R.drawable.ref_img, "Citas próximas"))
        items.add(OptionMenu(R.drawable.pdf_ref, "Órdenes de compra"))
        items.add(OptionMenu(R.drawable.pdf_ref, "Órdenes de compra"))
        items.add(OptionMenu(R.drawable.pdf_ref, "Órdenes de compra"))
        items.add(OptionMenu(R.drawable.pdf_ref, "Órdenes de compra"))
        items.add(OptionMenu(R.drawable.pdf_ref, "Órdenes de compra"))
        items.add(OptionMenu(R.drawable.pdf_ref, "Órdenes de compra"))

        return items
    }
}