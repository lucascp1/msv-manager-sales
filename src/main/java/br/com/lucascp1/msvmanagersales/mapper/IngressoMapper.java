package br.com.lucascp1.msvmanagersales.mapper;

import br.com.lucascp1.msvmanagersales.DTO.IngressoDTO;
import br.com.lucascp1.msvmanagersales.model.Ingresso;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class IngressoMapper {

    public Ingresso converterDtoParaEntidade(IngressoDTO dto){
        return new Ingresso(
                dto.getIdIngresso(),
                dto.getVendidos(),
                dto.getPreco(),
                dto.getAssento(),
                dto.getSetor(),
                dto.getPortaoEntrada(),
                dto.getJogo(),
                dto.getQuadra());
    }

    public IngressoDTO converterEntidadeParaDto(Ingresso ingresso){
        return new IngressoDTO(
                ingresso.getIdIngresso(),
                ingresso.getVendidos(),
                ingresso.getPreco(),
                ingresso.getAssento(),
                ingresso.getSetor(),
                ingresso.getPortaoEntrada(),
                ingresso.getJogo(),
                ingresso.getQuadra());
    }

    public List<Ingresso> converterListaDtoParaEntidade(List<IngressoDTO> listDto){
        List<Ingresso> listIngresso = new ArrayList<>();

        for (IngressoDTO dto:listDto) {
            Ingresso ingresso = new Ingresso();

            ingresso.setIdIngresso(dto.getIdIngresso());
            ingresso.setVendidos(dto.getVendidos());
            ingresso.setPreco(dto.getPreco());
            ingresso.setAssento(dto.getAssento());
            ingresso.setSetor(dto.getSetor());
            ingresso.setPortaoEntrada(dto.getPortaoEntrada());
            ingresso.setJogo(dto.getJogo());
            ingresso.setQuadra(dto.getQuadra());
            listIngresso.add(ingresso);
        }
        return listIngresso;
    }

    public List<IngressoDTO> converterListaEntidadeParaDto(List<Ingresso> listIngresso){
        List<IngressoDTO>  listDTO = new ArrayList<>();

        for (Ingresso ingresso:listIngresso) {
            IngressoDTO ingressoDTO = new IngressoDTO();

            ingressoDTO.setIdIngresso(ingresso.getIdIngresso());
            ingressoDTO.setVendidos(ingresso.getVendidos());
            ingressoDTO.setPreco(ingresso.getPreco());
            ingressoDTO.setAssento(ingresso.getAssento());
            ingressoDTO.setSetor(ingresso.getSetor());
            ingressoDTO.setPortaoEntrada(ingresso.getPortaoEntrada());
            ingressoDTO.setJogo(ingresso.getJogo());
            ingressoDTO.setQuadra(ingresso.getQuadra());
            listDTO.add(ingressoDTO);
        }
        return listDTO;
    }

    public Ingresso atualizaEntidadePorDTO(Ingresso ingresso, IngressoDTO ingressoDTO){
        ingresso.setVendidos(ingressoDTO.getVendidos());
        ingresso.setPreco(ingressoDTO.getPreco());
        ingresso.setAssento(ingressoDTO.getAssento());
        ingresso.setSetor(ingressoDTO.getSetor());
        ingresso.setPortaoEntrada(ingressoDTO.getPortaoEntrada());
        ingresso.setJogo(ingressoDTO.getJogo());
        ingresso.setQuadra(ingressoDTO.getQuadra());
        return ingresso;
    }
}
