package com.example.appconsultakotlin

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import kotlinx.android.synthetic.main.adapterdados.view.*

class AdapterDados (
    val dadosList:List<DadosList>,
    val onclick:(DadosList)->Unit): RecyclerView.Adapter<AdapterDados.DadosListViewHolder>() {

    class DadosListViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val cardNome: TextView
        val cardBody: TextView
        val cardProgress: ProgressBar
        var cardView: CardView

        init {
            cardNome = view.cardNome
            cardProgress = view.cardprogress
            cardView = view.cardlistap
            cardBody = view.cardbody
        }
    }

    override fun getItemCount() = this.dadosList.size

    //infla o layout adapter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DadosListViewHolder {
        //infla a view
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapterdados, parent, false)
        val holder = DadosListViewHolder(view)
        return holder

    }

    // atualiza os dados da view
    override fun onBindViewHolder(holder: DadosListViewHolder, position: Int) {
        val context = holder.itemView.context
        val dados1 = this.dadosList[position]


        holder.cardNome.text = dados1.nome
        holder.cardBody.text = dados1.nomeEmpresa
        holder.cardProgress.visibility = View.GONE
        holder.itemView.setOnClickListener { onclick(dados1) }

    }
}