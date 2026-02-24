# 📌 TaskManager

O TaskManager é um sistema de gerenciamento de tarefas desenvolvido em Java durante o ciclo básico da capacitação em Java do [Capacita iRede](https://capacitabrasil.irede.org.br/).

## 📖 Sobre o Projeto
O TaskManager é uma aplicação de gerenciamento de tarefas simples, que permite realizar o cadastro, atualização, exclusão e listagem de tarefas, além de fazer a validação de dados. Inicialmente, o sistema será acessado pelo console e possui um menu interativo para que as ações sejam realizadas

## 🏗️ Arquitetura
O projeto segue o padrão de arquitetura em camadas, dividido em:  
📦 taskmanager  
 &nbsp;┣ 📂 controller  
 &nbsp;┣ 📂 service  
 &nbsp;┣ 📂 repository  
 &nbsp;┣ 📂 model  
 &nbsp;┗ Main.java 
 
- Controller: Responsável pela interação com os usuários.
- Service: Contém as regras de negócio.
- Repository: Responsável pelo armazenamento das tarefas.
- Model: Represetação de entidade.

## ⚙️ Funcionalidades
&nbsp;✅ RF01 - Criar tarefa  
&nbsp;&nbsp;Permite a criação de uma nova tarefa.  
&nbsp;✅ RF02 - Listar tarefas  
&nbsp;&nbsp;Exibe todas as tarefas cadastradas no sistema.  
&nbsp;✅ RF03 - Atualizar tarefa  
&nbsp;&nbsp;Permite atualizar título, descrição e prazo.  
&nbsp;✅ RF04 - Remover tarefa.  
&nbsp;&nbsp;Remove uma tarefa através do ID.  

## 📜 Regras de negócio
- O título é obrigatório e deve conter no mínimo 3 caracteres.
- O ID é único e gerado automaticamente.
- A data de vencimento não pode ser anterior à data atual.

## 🛠️ Tecnologias utilizadas
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![POO](https://img.shields.io/badge/Programação_Orientada_a_Objetos-007396?style=for-the-badge)
![Arquitetura em Camadas](https://img.shields.io/badge/Arquitetura_em_Camadas-4CAF50?style=for-the-badge)
![LocalDate](https://img.shields.io/badge/LocalDate_(Java_Time_API)-FF6F00?style=for-the-badge)

## ▶️ Como Executar
1. Clone o repositório:
   ```
   git clone https://github.com/seu-usuario/TaskManager.git
   ```
2. Abra o projeto na sua IDE
3. Execute a classe ```Main.java```

---

<div align="center">

Desenvolvido por **Kendriks**  
Fevereiro de 2026

</div>
