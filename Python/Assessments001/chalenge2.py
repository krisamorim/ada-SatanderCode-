
def conta_elemento_lista(lista_A):
    #armazenar a contagem dos nomes recorrentes
    contar_nomes = {}
    
    #verificar recorrência
    for elemento in lista_A:
        if elemento in contar_nomes:
            contar_nomes[elemento] += 1
        else:
            contar_nomes[elemento] = 1

    #Verificar maior
    maior_contagem = max(contar_nomes.values())
    
    # Coletar todos os elementos com a maior contagem
    elementos_mais_frequentes = [k for k, v in contar_nomes.items() if v == maior_contagem]
    
    # Ordenar os elementos alfabeticamente e retornar o primeiro
    elementos_mais_frequentes.sort()
    return elementos_mais_frequentes[0]


A = ['junior', 'junior', 'alice', 'cecilia', 'junior', 'carlos', 'carlos', 'carlos', 'carlos', 'alice', 'alice'] #4 carlos 3 alice e 3 Jr

B = ['junior', 'junior', 'alice', 'cecilia', 'junior', 'carlos', 'carlos', 'alice', 'alice', 'alice'] #3 Jr e 3 Aline

print(f'O aluno(a) vecedor da turma A é: '+conta_elemento_lista(A).upper())

print(f'O aluno(a) vecedor da turma B é: '+conta_elemento_lista(B).upper())