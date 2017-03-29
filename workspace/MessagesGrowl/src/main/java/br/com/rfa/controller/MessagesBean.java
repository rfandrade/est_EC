package br.com.rfa.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class MessagesBean {

		public void adiconarMensagemErro(){
			FacesContext context = FacesContext.getCurrentInstance();
			
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_WARN,"Resumo da mensagem de erro","Mensagem de erro completa");
			
			context.addMessage("destinoErro", msg);
			
		}
		
		public void adicionarAvisoFlutuante(){
			FacesContext context = FacesContext.getCurrentInstance();
			
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_WARN,"Resumo da mensagem de aviso","Mensagem de aviso completa");
			
			context.addMessage("destinoAviso", msg);
			
		}
}