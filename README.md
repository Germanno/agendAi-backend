1. Auth User Service (Serviço de Autenticação de Usuário)
  Propósito: Gerenciar o acesso dos usuários ao sistema, incluindo personal trainers e clientes.

  Funcionalidades:
    - Registro e login de clientes e personal trainers.
    - Verificação de permissões, como acesso a agendamentos e ao perfil de treino.
    - Gerenciamento de perfis e preferências dos usuários.
    - Esquema de segurança e autenticação com tokens (JWT) para sessões seguras ou Spring Security.
  
    * Preferências de Disponibilidade do Personal Trainer
      - Permitir que os personal trainers indiquem sua disponibilidade geral, como "Manhã" (7h-12h), "Tarde" (12h-17h), "Noite" (17h-22h), ou até dias específicos da semana.
      - Isso ajuda o sistema a restringir automaticamente os horários possíveis de reserva para o personal, evitando conflitos e facilitando o gerenciamento.

    * Preferências de Horário do Cliente
      - Permitir que os clientes registrem suas preferências de horário para treinos, indicando períodos do dia ou dias da semana que sejam mais convenientes para eles.
      - Essas preferências são úteis para sugerir sessões de treino em horários compatíveis entre personal trainer e cliente.

    * Integração com Agendamento de Sessões Service
      - No momento da reserva de uma sessão, o Agendamento de Sessões Service pode verificar essas preferências para oferecer sugestões de horários ideais para ambos, mas a agenda específica e as reservas de horários seriam tratadas pelo Agendamento de Sessões Service.

    * Atualização Automática de Disponibilidade
      - Sempre que uma sessão é marcada ou cancelada, a disponibilidade do personal trainer (e, se relevante, do cliente) é atualizada para refletir os horários reservados e os horários livres.

3. Agendamento de Sessões Service (Serviço de Agendamento de Treinos)
  Propósito: Lógica para gerenciar sessões de treino ou aulas individuais.    
  Funcionalidades:
    - Criação, edição e exclusão de sessões de treino (com datas, horários, local, descrição do treino).
    - Permitir aos clientes reservar aulas e aos personal trainers configurarem disponibilidade de agenda.
    - Sistema de gerenciamento de sessões em grupo ou individuais, conforme a preferência do cliente e do personal.
    - Informações detalhadas sobre cada sessão, como nível de dificuldade, duração e requisitos.

4. Funções do Estabelecimento Service:
  Propósito: Permitir ao personal trainer ou administrador do sistema cadastrar academias ou locais onde as sessões serão realizadas.
  Funcionalidades:
    - Cadastro e Gerenciamento de Estabelecimentos: Permitir ao personal trainer ou administrador do sistema cadastrar academias ou locais onde as sessões serão realizadas.
    - Horário de Funcionamento: Incluir informações sobre os horários em que o estabelecimento está disponível para reserva.
    - Recursos do Estabelecimento: Informar se o local tem equipamentos específicos (ex: pesos, esteiras) que possam ser necessários para o treino.

5. Notification Service (Serviço de Notificação)
  Propósito: Notificar clientes e personal trainers sobre confirmações de reserva, mudanças ou cancelamentos nas sessões.
  Funcionalidades:
    - Notificação por e-mail, SMS ou aplicativo móvel para lembretes de aulas.
    - Avisos sobre alterações de horário, cancelamentos ou novas sessões disponíveis.
    - Notificações de cobrança para lembrar clientes sobre pagamentos pendentes ou vencidos.
    - Sistema de mensagens entre o personal e os clientes para troca de informações sobre os treinos.

6. Payment Service (Serviço de Pagamento)
  Propósito: Gerenciar pagamentos pelas sessões de treino, incluindo pacotes e assinaturas, se aplicável.
  Funcionalidades:
    - Processamento de pagamentos individuais por sessão ou em pacotes de várias aulas.
    - Opção de assinaturas mensais ou semanais para clientes que desejam um plano fixo.
    - Histórico de transações para os clientes e relatórios de receitas para o personal.
    - Integração com provedores de pagamento como PayPal, Stripe ou transferências bancárias.
